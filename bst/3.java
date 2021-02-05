package play;

public class App 
{
    public static void main( String[] args )
    {
        BinarySearchTree bct = new BinarySearchTree();
        bct.insert(50); 
        bct.insert(30); 
        bct.insert(20); 
        bct.insert(40); 
        bct.insert(70); 
        bct.insert(60); 
        bct.insert(80);
        bct.inorder();
    }
}
