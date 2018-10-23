package Q4_02_Minimal_Tree;

import CtCILibrary.BTreePrinter;
import CtCILibrary.TreeNode;
public class Solution {
    public static void main(String args[]){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BTreePrinter.printNode(createMinimalBST(numbers,0, numbers.length-1));
    }

    public static TreeNode createMinimalBST(int[] n, int s, int l){
        if(s>=l){
            return null;
        }
        int mid = (s+l)/2;
        TreeNode node = new TreeNode(n[mid]);
        node.left = createMinimalBST(n,s,mid);
        node.right = createMinimalBST(n,mid+1,l);
        return node;
    }
}
