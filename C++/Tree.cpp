#include <iostream>
using namespace std;

class TreeNode {
public:
    int data;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int data) : data(data), left(nullptr), right(nullptr) {}
};

class BinaryTree {
public:
    TreeNode* root;

    BinaryTree() : root(nullptr) {}

    void insert(int data) {
        root = insertRecursive(root, data);
    }

    TreeNode* insertRecursive(TreeNode* current, int data) {
        if (current == nullptr) {
            return new TreeNode(data);
        }

        if (data < current->data) {
            current->left = insertRecursive(current->left, data);
        } else if (data > current->data) {
            current->right = insertRecursive(current->right, data);
        }

        return current;
    }

    void displayTree() {
        displayTreeRecursive(root, 0);
    }

    void displayTreeRecursive(TreeNode* current, int level) {
        if (current == nullptr) {
            return;
        }

        displayTreeRecursive(current->right, level + 1);
        cout << endl;

        for (int i = 0; i < level; i++) {
            cout << "    ";
        }

        cout << current->data;
        displayTreeRecursive(current->left, level + 1);
    }
};

int main() {
    BinaryTree tree;

    // Insert elements into the binary tree
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(80);

    // Display the tree
    cout << "Binary Tree Structure:" << endl;
    tree.displayTree();
    
    return 0;
}
