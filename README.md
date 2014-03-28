JSONTools
=========

Text conversion utilities for JSON.

This set of utilities aids in converting JSON to and from other formats, such as XML, CSV, etc. For now, only CSV is implemented. 

This library is particularly useful for importing JSON data into a visualzation tool such as Tableau or Gephi.

Given a JSON document such as the following

{
  "key1": "value1",
  "key2": "value2",
  "key3": "value3",
  "key4": "value4",
  "key5": "value5"
}

JSONTools would produce the following CSV file:

key1,key2,key3,key4,key5
value1,value2,value3,value4,value5

For subsequent documents with matching keys, it would add values to subsequent lines.

key1,key2,key3,key4,key5
value1,value2,value3,value4,value5
value6,value7,value8,value9,value10

Missing keys will be represented as you would expect:


key1,key2,key3,key4,key5
value1,,value3,value4,value5

In the document above, the JSON document is missing a key2.

For arrays, the library simple adds column headers for each element of the array, incrementing a counter and adding it to the key name. For instance, given the following JSON document:

{
  "key1": "value1",
  "key2": "value2",
  "key3": "value3",
  "key4": "value4",
  "key5": [1,2,3,4,5]
}

JSONTools would produce the following CSV:

key1,key2,key3,key4,key5.1,key5.2,key5.3,key5.4,key5.5
value1,value2,value3,value4,1,2,3,4,5

Subdocuments work similarly to arrays:

{
  "key1": "value1",
  "key2": "value2",
  "key3": "value3",
  "key4": "value4",
  "key5": {"subdockey1":"subdocval1","subdockey2":"subdocval2","subdockey3":"subdocval3"}
}

outputs

key1,key2,key3,key4,key5.subdockey1,key5.subdockey2,key5.subdockey3
value1,value2,value3,value4,subdocval1,subdocval2,subdocval3

XML

To come....
