import "./styles.css";
import { config } from "./config";
import { useState } from "react";

const transform1 = (nodes, id, checked, parentChecked) => {
  if (!nodes?.length) return [];
  return nodes.map((node) => {
    const childNodes = transform1(
      node?.items,
      id,
      checked,
      node.id == id ? checked : parentChecked
    );
    if (node.id == id) {
      return {
        ...node,
        checked,
        items: childNodes,
      };
    }
    return {
      ...node,
      checked: parentChecked != null ? parentChecked : node.checked,
      items: childNodes,
    };
  });
};
const transform2 = (nodes) => {
  if (!nodes?.length) return [];
  return nodes.map((node) => {
    const childNodes = transform2(node?.items);
    const allChecked = childNodes.filter((node) => !node.checked).length === 0;
    return {
      ...node,
      checked: childNodes.length > 0 ? allChecked : node.checked,
      items: childNodes,
    };
  });
};
const Checkbox = ({ data, setData, padding, name, id, checked }) => {
  const handleChange = (e) => {
    setData(transform2(transform1(data, id, e?.target?.checked, null)));
    e?.stopPropagation();
  };
  return (
    <div style={{ paddingLeft: `${padding}px` }}>
      <input
        type="checkbox"
        checked={checked}
        name={name}
        id={id}
        onChange={handleChange}
      />
      <label for={name} style={{ paddingLeft: "5px" }}>
        {name}
      </label>
    </div>
  );
};
const ShowCheckboxes = ({
  orignalData,
  data,
  padding,
  checkedBoxes,
  setData,
}) => {
  console.log(data);
  return data.map((d) => {
    return (
      <>
        <Checkbox
          padding={padding}
          name={d.name}
          id={d.id}
          checked={d.checked}
          data={orignalData}
          setData={setData}
        />
        {d?.items?.length > 0 && (
          <ShowCheckboxes
            data={d.items}
            padding={padding + 20}
            checkedBoxes={checkedBoxes}
            setData={setData}
            orignalData={orignalData}
          />
        )}
      </>
    );
  });
};
export default function App() {
  const [checkedBoxes, setCheckedBoxes] = useState(new Set([]));
  const [data, setData] = useState(config);
  return (
    <div className="App">
      <ShowCheckboxes
        data={data}
        orignalData={data}
        padding={0}
        checkedBoxes={checkedBoxes}
        setData={setData}
      />
    </div>
  );
}
