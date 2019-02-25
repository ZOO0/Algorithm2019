package Q4_3;/*

*4.3 깊이의 리스트 : 이진트리가 주어졌을 때, 같은 깊이에 있는 노드를 연결리스트로 연결해 주는 알고리즘을 설계하라. 즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야한다.

input : {18, 7, 26, 3, 12, 21, 31}

<풀이 방법>

*/


public class Q4_3 {

    static int[] sampleArrayForBinarySearchTree = {10, 5, 3, 7, 15, 20};

    public static void main(String[] args) {

        // 샘플 트리만들기
        BinarySearchTree BSTsampleTree = new BinarySearchTree();

        for (int i = 0; i < sampleArrayForBinarySearchTree.length; i++) {
            BSTsampleTree.add(sampleArrayForBinarySearchTree[i], 0);
        }

        /* 트리가 이진탐색트리인가? */
        System.out.println("isBinarySearchTree : " + BSTsampleTree.isBinarySearchTree(BSTsampleTree.root));

    }
}