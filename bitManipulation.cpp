#include <bits/stdc++.h>
using namespace std;

int getBit(int n, int i) {
    return ((n & (1 << i)) != 0);
}

int setBit(int n, int i) {
    return (n | (1 << i));
}

int clearBit(int n, int i) {
    return (n & ~(1 << i));
}

int updateBit(int n, int i, int bit) {
    n = clearBit(n ,i);
    return (n | (bit << i));
}

int main(int argc, char const *argv[])
{
    cout << "Enter 1 to Get Bit.\nEnter 2 to Set Bit.\nEnter 3 to Clear Bit.\nEnter 4 to Update Bit.\n";
    int ch;
    cin >> ch;
    switch (ch)
    {
    case 1: {
        cout << "Enter the number and position: ";
        int n, i;
        cin >> n >> i;
        cout << "Value of the number after manipulation is = " << getBit(n, i) << endl;
        break;
    }

    case 2: { 
        cout << "Enter the number and position: ";
        int n, i;
        cin >> n >> i;
        cout << "Value of the number after manipulation is = " << setBit(n, i) << endl;
        break;
    }

    case 3: {
        cout << "Enter the number and position: ";
        int n, i;
        cin >> n >> i;
        cout << "Value of the number after manipulation is = " << clearBit(n, i) << endl;
        break;
    }

    case 4: {
        cout << "Enter the number, position and the bit by which update is to be done: ";
        int n, i, bit;
        cin >> n >> i >> bit;
        cout << "Value of the number after manipulation is = " << updateBit(n, i, bit) << endl;
        break;
    }   

    default: cout << "Invalid Choice!";
        break;
    } 
    return 0;
}
