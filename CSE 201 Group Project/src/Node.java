import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Node<T>
{
	private T data = null;
	private Node<T> parent = null;
	private List<Node<T>> children = new ArrayList<>();
	
	public Node(T data)
	{
		this.data = data;
	}
	
	public Node(T data, Node<T> parent)
	{
		this.data = data;
		this.setParent(parent);
	}
	
	public void addChild(Node<T> child)
	{
		child.setParent(this);
		this.children.add(child);
	}
	
	public void addChild(T t)
	{
		addChild(new Node<T>(t));
	}
	
	public void addChildren(List<Node<T>> children)
	{
		children.forEach(c -> c.setParent(this));
		this.children.addAll(children);
	}
	
	public List<Node<T>> getChildren()
	{
		return children;
	}
	
	public T getData()
	{
		return data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public Node<T> getParent()
	{
		return parent;
	}
	
	public void setParent(Node<T> parent)
	{
		this.parent = parent;
	}
	
	public Node<T> getRoot()
	{
		if(this.isRoot())
		{
			return this;
		}
		
		return parent.getRoot();
	}
	
	public boolean isRoot()
	{
		return parent == null;
	}
	
	public void forEachChild(Consumer<Node<T>> f)
	{
		children.forEach(f);
	}
	
	// Returns s-expression representation of tree.
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("(node ").append(data);
		for(Node<T> node : children)
		{
			sb.append(System.lineSeparator()).append("\t")
					.append(node.toString());
			
		}
		sb.append(")");
		
		return sb.toString();
	}
}