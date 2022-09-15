# C++ STL (Standard Template Library)

STL is a set of C++ template classes to provide common programming data structures and functions such as lists, stacks, arrays, etc. It is a library of container classes, algorithms, and iterators. It is a generalized library and so, its components are parameterized. A C++ program may include multiple libraries.

## Containers

Containers are the objects that store data. They are implemented as class templates, which allows a great flexibility in the types supported as elements.

### Sequence Containers

Sequence containers are implemented as arrays that can change in size. The main difference between an array and a vector is that the size of an array cannot be changed once it is created, whereas a vector's size can change dynamically, with their storage being handled automatically.

#### Vector

Vectors are sequence containers representing arrays that can change in size.

```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v;
    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;
    return 0;
}
```
