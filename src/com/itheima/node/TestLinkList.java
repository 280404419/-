package com.itheima.node;

public class TestLinkList {

	public static void main(String[] args) {  
        LinkList linkList = new LinkList();  
        linkList.addFirstNode(20);  
        linkList.addFirstNode(21);  
        linkList.addFirstNode(19);  
        System.out.println(linkList.length());
         //19,21,20  
       /* linkList.add(1, 22); //19,22,21,20  
        linkList.add(2, 23); //19,22,23,21,20  
        linkList.add(3, 99); //19,22,23,99,21,20  
*/     //Node node = null;
     // Node node = linkList.deleteFirstNode();  
     // System.out.println("node : " + node.data);  
     // linkList.displayAllNodes();  
      //node = linkList.deleteByPos(0);  
      //System.out.println("node : " + node.data);  
      //linkList.displayAllNodes();  
//      linkList.deleteFirstNode();  
       /* Node node = linkList.deleteByData(23);  
        System.out.println("node : " + node.data);  
         linkList.displayAllNodes();  */
//      Node node = linkList.deleteByPos(0);  
       // System. out.println( "node : " + node. data);  
        linkList.displayAllNodes();  
       /* Node node1 = linkList.findByPos(1);  
        System. out.println( "node1: " + node1. data);  
        Node node2 = linkList.findByData(22);  
        System. out.println( "node2: " + node2. data);  */
   }  
}
