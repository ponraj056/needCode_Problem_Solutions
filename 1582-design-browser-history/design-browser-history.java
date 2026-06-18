class BrowserHistory {
    class Node{
        String url;
        Node next;
        Node prev;
        Node(String data){
            this.url=data;
            next=null;
            prev=null;
        }
    }
    Node head;
    public BrowserHistory(String homepage) {
        this.head=new Node(homepage);
    }
    
    public void visit(String url) {
        Node node=new Node(url);
        head.next=node;
        node.prev=head;
        head=head.next;
    }
    
    public String back(int steps) {
        while(head.prev!=null && steps!=0){
            head=head.prev;
            steps--;
        }
        return head.url;
    }
    
    public String forward(int steps) {
        while(head.next!=null && steps!=0){
            head=head.next;
            steps--;
        }
        return head.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */