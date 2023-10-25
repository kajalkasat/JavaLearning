package collectionsDS.Heap;


public class HeapSort {
    /*
    heapsort : build max.heap 
    heapsort uses max. heap to find the max. element at the root,
    then if we swap the root, the heap gets disturbed, now if we call heapify, all the nodes will get placed.

    heapsort idea is based on selection sort.
    In selection sort, we find the max and place it at the end, TC = O(n*n) as it uses linear search
    heapsort optimises this time, by finding the max using max. heap TC = O(n * log(n))
    */
    int arr[];
    int capacity, size;

    HeapSort(int c)
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

    
    void maxHeapify(int n, int i)
    {
        int largest = i;
        int l = leftIndex(i);
        int r = rightIndex(i);

        if(l<n && arr[largest] < arr[l])
        {
            largest = l;
        }
        if(r<n && arr[largest] < arr[r])
        {
            largest = r;
        }

        if(largest != i)
        {
            swap(arr,i,largest);
            maxHeapify(size,largest);
        }
    }

    // TC for buildheap = O(n) ; n = size
    void buildHeap()
    {
        for(int i = (size-2)/2 ; i>=0 ; i--)
        {
            maxHeapify(size,i);
        }
    }


    void heapsort()
    {
        buildHeap();
        for(int i = size-1 ; i>=1 ; i--)
        {
            swap(arr,0,i);
            maxHeapify(i,0); // keep heapify(0), and heap size should be reduced, as i is getting decremented, the i-1 position will be considrered 
                            // and size will be reduced automatically
            
        }
    }

    void swap(int arr[] , int a, int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
