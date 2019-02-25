package Q4_5;


/* 4.5* BST검증 : 주어진 이진 트리가 이진 탐색 트리인지 확인하는 함수를 작성하라.

<풀이 방법>
전위 순회 방식으로 트리를 훑으면서
이진검색트리 조건에 부합하지 않으면 false 리턴.
이진검색트리 조건 : 모든 왼쪽 자식들 <= node < 오른쪽 자식들

*/


public class Q4_5 {

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