package com.javafee.java.lessons.lesson26.fronted;



import com.javafee.java.lessons.lesson26.backend.FileService;
import com.javafee.java.lessons.lesson26.backend.MapperService;
import com.javafee.java.lessons.lesson26.backend.Pracownik;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Pracownik pracownik = new Pracownik("Dawid", 3);
        FileService fileService = new FileService();
        fileService.save("mvcperson.txt", Stream.of(pracownik).map(MapperService::pracownikTo).collect(Collectors.toList()));
        List<Pracownik> data = fileService.read("mvcperson.txt").stream().map(MapperService::pracownikFrom).toList();
        System.out.println("Lista");
        fileService.read("mvcperson.txt").forEach(System.out::println);
        Pracownik model = pobierzPracownikaZBazyDanych();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.updateView();

        controller.setPracownikImie("Krzysiek");
        System.out.println("\nDane pracownika po aktualizacji: ");
        controller.updateView();
    }

    private static Pracownik pobierzPracownikaZBazyDanych() {
        Pracownik Pracownik = new Pracownik("Tomek", 6);
        Pracownik.setName("Tomek");
        Pracownik.setId("6");
        Pracownik.setDepartment("IT");
        return Pracownik;
    }

    //    function removeMax(head){
////szukamy największego elementu
//        Node maxNode = head;
//        Node prevNode = null;
//        Node currNode = head;
//        while(currNode != null){
//            if(currNode.data > maxNode.data){
//                maxNode = currNode;
//                prevNode = prevNode;
//            }
//            prevNode = currNode;
//            currNode = currNode.next
//        }
//
////Usuwamy największy element
//        if(maxNode == head){
//            head = head.next;
//        }else{
//            prevNode.next = maxNode.next;
//        }
//        return head;
//    }
//    class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int val){
//            this.val = val;
//        }
//    }
//
//    int sum(TreeNode root){
//        if(root == null)
//            return 0;
//    }
//
//    int leftSum = sum(root.left);
//    int rightSum = sum(root.right);
//
//return root.val + leftSum + rightSum;
//}

        class ListNode {
            int val;
            ListNode prev;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

        void addBefore(ListNode node, int index, int val) {
            ListNode newNode = new ListNode(val);
            ListNode curr = node;

            for (int i = 0; i < index && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) {
                return
            }

            ListNode prev = curr.prev;
            newNode.prev = prev;
            newNode.next = curr;
            prev.next = newNode;
            curr.prev = newNode;
        }
    }