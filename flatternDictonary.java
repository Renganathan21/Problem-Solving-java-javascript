function flattenDictionary(obj, parentKey = '', result = {}) {
    for (let key in obj) {
        const value = obj[key];
        const newKey = parentKey ? `${parentKey}.${key}` : key;

        if (typeof value === 'object' && value !== null && !Array.isArray(value)) {
            flattenDictionary(value, newKey, result);
        } else {
            result[newKey] = value;
        }
    }
    return result;
}
const input = {
    key: 3,
    foo: {
        a: 5,
        bar: {
            baz: 8
        }
    }
};

const flattened = flattenDictionary(input);
console.log(flattened);
