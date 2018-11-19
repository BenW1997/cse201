import java.util.ArrayList;
import java.util.List;

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
	
	public void delete()
	{
		for(Node<T> node : children)
		{
			if(node.children.isEmpty())
			{
				
			}
		}
	}
	
	public Node<T> getRoot()
	{
		if(this.parent == null)
		{
			return this;
		}
		
		return parent.getRoot();
	}
}