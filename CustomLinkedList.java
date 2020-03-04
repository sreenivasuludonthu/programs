import java.util.Arrays;
import java.util.*;
class DataList<E>
{
	Object elements[];
	int i,newSize,size=0;
	int default_capacity=10;
	DataList()
	{
		elements=new Object[default_capacity];
	}
	void add(E e) 
	{
        if (size == elements.length) 
		{
            increaseSize();
        }
        elements[size++] = e;
    }
	void increaseSize() 
	{
        newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
	void display()
	{
		for(i=0;elements[i]!=null;i++)
		{
			System.out.println(""+elements[i]);
		}
	}
	void remove(int i)
	{
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
	}
	int size() 
	{
        return size;
	}
}
class CustomLinkedList
{
    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
		int ch,element,index;
		System.out.println("Enter your choice");
		System.out.println("1.Insert 2.Delete 3.Display 4.SizeofList");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		while(ch<=4){
		switch(ch)
		{
			case 1:
					//Add elements
					System.out.println("Enter the Element");
					element=s.nextInt();
					list.add(element);
					break;
			case 2:
					//Remove elements from index
					System.out.println("Enter index of element to remove");
					element=s.nextInt();
					list.remove(element);
					break;
			case 3:
					//display elements in list
					System.out.println("The Elements in List:");
					list.display();
					break;
			case 4:
					//List Size
					System.out.println(list.size());
					break;
		}
		System.out.println("1.Insert 2.Delete 3.Display 4.Size of List 5.Exit");
		ch=s.nextInt();
		}
        
    }
}