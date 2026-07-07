class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // left side
    private PriorityQueue<Integer> minHeap; // right side
    
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
         if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        // If even → average of two middle values
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }    
}
