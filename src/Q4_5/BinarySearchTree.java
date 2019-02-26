package Q4_5;

import java.util.Comparator;

/*

이진검색트리 클래스

이진검색트리를 만들고, add, search, 순회하는 기능을 담은 클래스

 */

public class BinarySearchTree<K,V> {

    Node<K, V> root; // 루트
    private Comparator<? super K> comparator = null;  // 비교자(키 값의 대소 관계를 비교)

    // 생성자
    public BinarySearchTree() {
        root = null;
    }

    // 생성자
    public BinarySearchTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    // 키값 비교
    private int compare(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    // 검색
    private V search(K key) {
        Node<K, V> p = root;
        while (true) {
            if (p == null) return null;
            int condition = compare(key, p.getKey());
            if (condition == 0) {
                return p.getValue();    // 검색 성공
            } else if (condition < 0) {
                p = p.left; // 왼쪽 서브트리에서 탐색
            } else {
                p = p.right; // 오른쪼 서브트리에서 탐색
            }
        }
    }

    //노드 추가
    private void addNode(Node<K, V> node, K key, V data) {
        int condition = compare(key, node.getKey());
        if (condition == 0) {
            return; // key가 트리 이미 있음
        } else if (condition < 0) {
            if (node.left == null) {
                node.left = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.left, key, data);
            }
        } else {
            if(node.right == null){
                node.right = new Node<K,V>(key, data, null, null);
            } else {
                addNode(node.right, key, data);
            }
        }
    }

    public void add (K key, V data){
        if (root == null) {
            root = new Node<K, V>(key, data, null, null);
        } else {
            addNode(root, key, data);
        }
    }

    /*
    *  트리 순회
    * */

    /* 전위 순회 : 자식노드보다 현재 노드를 먼저 방문 */
    public boolean preorderTraversal(Node node){
        if(node!=null){
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
        return true;
    }

    /* 중위 순회 : 왼쪽가지, 현재노드, 오른쪽가지 순서로 노드를 '방문'하고 출력 */
    public void inorderTraversal(Node node){
        if(node!=null){
            inorderTraversal(node.left);
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.right);
        }
    }

    /* 후위 순회 : 모든 자식 노드들을 방문한 뒤 마지막에 현재 노드를 방문 */
    public void postorderTraversal(Node node){
        if(node!=null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.getKey() + " ");
        }
    }

    /* 트리가 이진탐색트리인가? */
    int lastNodeKey;
    public boolean isBinarySearchTree(Node node){
        if(node!=null){

            isBinarySearchTree(node.left);

            System.out.print(node.getKey() + " ");

            if( lastNodeKey > (int)node.getKey() ){ //현재 노드 키와 이전 노드 키를 비교
                return false;
            }
            lastNodeKey = (int)node.getKey();
//            System.out.print("(lastNodeKey : " + lastNodeKey + ") ");

            isBinarySearchTree(node.right);
        }
        return true;
    }


    // ** 노드 클래스
    class Node<K, V> {
        private K key;           // 키 값
        private V data;          // 데이터
        private Node<K, V> left; // 왼쪽 자식 노드 포인터
        private Node<K, V> right;// 오른쪽 자식 노드 포인터

        // 생성자
        Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        // 키 값을 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return data;
        }

        // 데이터를 출력
        void print() {
            System.out.println(data);
        }
    }
}
