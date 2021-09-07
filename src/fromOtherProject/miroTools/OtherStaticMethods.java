package fromOtherProject.miroTools;


import fromOtherProject.archive.TreeNode;
import fromOtherProject.random.Database;
import fromOtherProject.random.Product;

import java.util.*;

public class OtherStaticMethods {

    public static void searchInTree_breadthApproach(TreeNode tree, String searchedTerm ){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(tree);
        while (queue.size()>0){
            //TreeNode currentNode = (TreeNode) queue.remove();
            TreeNode currentNode = queue.poll();

            if (currentNode.getValue().equals(searchedTerm)) {
                System.out.println(currentNode.getValue());
            } else {
                if (currentNode.getLeft() != null) queue.add(currentNode.getLeft());
                if (currentNode.getRight() != null) queue.add(currentNode.getRight());
            }
        }
    }
    public static void searchInTreeRecursively_breadthApproach(TreeNode currentNode,String searchedTerm ){
        if (currentNode.getValue().equals(searchedTerm)) {
            System.out.println(currentNode.getValue());
        } else {
            if (currentNode.getLeft() != null) searchInTreeRecursively_breadthApproach(currentNode.getLeft(),searchedTerm);
            if (currentNode.getRight() != null) searchInTreeRecursively_breadthApproach(currentNode.getRight(),searchedTerm);
        }
    }
    public static void testListPerformance(List<Integer> numbers, String name) {
        Long startTime = System.currentTimeMillis();
        //Long startTime = System.nanoTime();

        //int length = numbers.size(); 0ms
        //System.out.println("Length of " + name +": "+ length);

        //numbers.get(0);
        //numbers.get(numbers.size()/2); // LL:34ms AL:0ms\
        //numbers.get(numbers.size()-1); // 0ms

        numbers.add(0,7); // LL:0ms  AL:7ms
        //numbers.add(numbers.size()/2, 7); //linkedList:31ms, aL: 4ms !!!!!!!!!!
        //numbers.add(numbers.size()-1,7); //0ms

        //System.out.println("searched element found: " + numbers.contains(2_000_000)); //!!!!!!!! O(n); LL:278ms AL: 65ms

        Long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration of " + name + ": " + duration + " ms");
    }
    public static void compareArrayListAndSet(){
        List list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();

        for (int i=0;i<=1_000_000;i++){
            list.add(i);
            set.add(i);
        }

        int counter=0;
        Timer.start();
        for (int i=0;i<=1_000;i++) if(list.contains(i)) counter++;
        Timer.stopAndShow();
        System.out.println("list_contains - matches: "+counter);

        counter=0;
        Timer.start();
        for (int i=0;i<=1_000;i++) if(set.contains(i)) counter++;
        Timer.stopAndShow();
        System.out.println("\nset_contains - matches: "+counter);
        counter=0;


        System.out.println("--------");

        Timer.start();
        for (int i=0;i<=1_000_000;i++) list.get(i);
        Timer.stopAndShow("list_iterate");

        Timer.start();
        Iterator iterator =set.iterator();
        for (int i=0;i<=1_000_000;i++) iterator.next();
        Timer.stopAndShow("set_iterate-for");

        Timer.start();
        Iterator iterator2 =set.iterator();
        while (iterator2.hasNext()) iterator2.next();
        Timer.stopAndShow("set_iterate-while");


        System.out.println("--------- NoSQL----------");

    }
    public static void databaseAndProduct(){
        Database db = new Database();
        Product ball = new Product("ball",50,"Adidas");
        Product ball2 = new Product("ball2",70,"Adidas");
        Product racket = new Product("racket",100,"Nike");
        db.add(ball);
        db.add(ball2);
        db.add(racket);
        //System.out.println(db.getProductByName("ball"));
        //System.out.println(db.contains(ball));
        //System.out.println(db.contains("ball"));
        //System.out.println(db.size());
        //db.remove("ball");

        Database dbSel = db.getProductsBySeller("Adidas");
        //System.out.println(dbSel.size());

        Database dbPr  = db.getProductsByPrice(60,190);
        db.show();
        dbPr.show();
        //dbSel.show();
    }
}
