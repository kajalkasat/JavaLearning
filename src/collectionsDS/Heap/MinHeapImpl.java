package collectionsDS.Heap;

class MinHeap 
{
    int arr[];
    int capacity, size;

    MinHeap(int c)
    {
        arr = new int[c];
        capacity = 10; // define the capacity greater than the actual size
        size = 0;
    }

    int leftIndex(int i)
    {
        return ((2*i)+1);
    }

    int rightIndex(int i)
    {
        return ((2*i)+2);
    }

    int parentIndex(int i)
    {
        return ((i-1)/2);
    }

    /*
        insertion in min heap : 
        1. insert the element at the end of the array / min heap's logical representation
        2. compare the element with its parent, as in min heap parent < its descendants
        3. if parent > element, we swap

        the max. possible is we insert the element at the root = height of tree = O(log(size))
        hence, insertion in min heap time complexity = O(log(size))
    */

    void insertion(int x)
    {
        if(size == capacity)
            return;
        
        size++;
        arr[size-1] = x; // insert at the end
        for(int i=size-1 ; i>=0 && arr[parentIndex(i)] > arr[i] ; i--) 
        {
            swap(arr,arr[parentIndex(i)],arr[i]);
            i = parentIndex(i); //updating for next iteration, until we reach the last possible location
            
        }
    }

    void swap(int arr[] , int a, int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    /*
        Heapify:
        1. find the min of (index to be heapified, left of index to be heapified, right of index to be heapified)
        2. if the index to be heapified == min of(...), then heap is perfect and no violations
        3. else swap with the min of(...) and heapify(minof(...))

        best case = O(1)
        worst case = O(height of min. heap / size) = O(log(size))
    */
    void minHeapify(int mini) // mini is the index to be heapified
    {   
        
        int l = leftIndex(mini);
        int r = rightIndex(mini);
        int smallest = mini; 
        if(l<size && arr[smallest] > arr[l])
        {
            smallest = l;
        }
        if(r<size && arr[smallest] > arr[r])
        {
            smallest = r;
        }

        if(smallest != mini)
        {
            swap(arr,smallest ,mini );
            minHeapify(smallest);
        }

        else
            return;
    }


    /*
        Extract min : remove the min. element from the min heap, and return the heap
        1. min element in min. heap is arr[0].
        2. swap(arr[0],arr[size-1]), and do size-- (so that the arr[0] is now removed)
        3. to form proper non-violated heap, minheapfiy(0)

        TC: O(1)[upto swap operation all are O(1)] + O(log(size)) = O(log(size))
    */
    
    int extractmin()
    {
        if(size==0)
            return -1;

        if(size==1) // another base case because, if the arr is of size=1 then we will swap it with itself, and remove
                    // thus, arr will be empty and minHeapify is designed such that elements exist
        {
            size--;
            return arr[0];
        }

        int m = arr[0];
        swap(arr,arr[0],arr[size-1]);
        size--;
        minHeapify(0);
        return m;
    }


    void decreaseKey(int i, int x) // i is the index, at which x is to be updated // TC : O(log(size))
    {
        arr[i] = x; // initially, update the value of x at the mentioned index
        while(i!=0 && arr[parentIndex(i)] > arr[i])
        {
            swap(arr,i,parentIndex(i));
            i = parentIndex(i);
        }

    }

    /*
        Delete key at the given index:
        1. min heap has the minimum possible element at the 0th index.
        2. arr[index to be deleted] = -infinity which is Integer.MIN_VALUE
        3. after updating the value we want to create a valid min.heap, which is done in decreaseKey()
        4. hence, we directly call decrease key(i,-infinity)
        5. to remove -infinity from min.heap, call extract min.

        TC : O(log(size)) ; size = height of min. heap / BT
    */

    void deleteKey(int i)
    {
        decreaseKey(i, Integer.MIN_VALUE);
        extractmin();
    }

    // build heap : given an array of elements, rearrange to form a min. heap
    void buildHeap()
    {
        /*
            its size-2 because:
            parentindex = (i-1)/2
            lets say size = 11, last element would be at (size-1)
            so the parent of the bottomost last sub-BT would be ((size-1)-1)/2 = (size-2)/2
        */
        for(int i = (size-2)/2 ; i>=0 ; i--)
        {
            minHeapify(i);
        }
    }


}

public class MinHeapImpl 
{
    
}
