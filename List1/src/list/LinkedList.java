package list;

public class LinkedList {
	Node first;
	int size;

	public void FreeNode(Node n) {
		n = null;
	}

	public int Size() {
		return this.size;
	}

	public boolean IsEmpty() {
		return this.Size() == 0;
	}

	public void Insert(int x) {
		if (this.first == null) {
			Node node = new Node(x);
			this.first = node;
		} else {
			Node i = this.first;
			while (i.next != null) {
				i = i.next;
			}
			Node node = new Node(x);
			i.next = node;
			this.size = this.size + 1;
		}
	}

	public void show() {
		Node n = this.first;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void DeleteAfter(Node n) {
		if (this.IsEmpty() || n == null || n.next == null) {
			System.out.println("Element does not exist");
		}
		Node r = n.next;
		n.next = r.next;
		FreeNode(r);
		this.size = this.size - 1;
	}

	public void PurgeList() {
		Node p = this.first;
		while (p != null) {
			Node q = p;
			while (q.next != null) {
				if (p.data == q.next.data) {
					this.DeleteAfter(q);
				} else
					q = q.next;
			}
			p = p.next;
		}
		this.show();
	}

	public Node RecursiveR(Node p) {
		if (p == null || p.next == null) {
			return p;
		}
		Node q = p.next;
		Node r = this.RecursiveR(q);
		q.next = p;
		p.next = null;
		return r;

	}

	public Node Reverse() {
		if (this.size < 2) {
			return this.first;
		}
		Node p = null;
		Node q = this.first;
		Node r = q.next;
		while (r != null) {
			q.next = p;
			p = q;
			q = r;
			r = r.next;
		}
		q.next = p;
		return q;
	}
}
