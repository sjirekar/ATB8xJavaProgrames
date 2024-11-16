package nov.ex_04112024_Collection_Framework_Set_PQ_MAP.Task;

public class Task2_04112024_HashTable_vs_HashMap {
    public static void main(String[] args) {
//        Hashtable in Java
//        A Hashtable is a data structure in Java that implements the Map interface and is used to store key-value pairs. It uses a technique called hashing to convert keys into unique hash codes and then maps these hash codes to the values.
//
//        Key Characteristics of Hashtable:
//        Synchronized: Hashtable is thread-safe, meaning multiple threads can access it without causing data inconsistency.
//
//                Null Values: It does not allow null keys or values.
//
//                Legacy Class: Hashtable is considered a legacy class and was part of the original version of Java.
//
//        HashMap in Java
//        A HashMap is also a data structure that implements the Map interface to store key-value pairs. It uses a similar hashing technique but differs in various ways from Hashtable.
//
//                Key Characteristics of HashMap:
//        Not Synchronized: HashMap is not thread-safe by default. If multiple threads access a HashMap concurrently, external synchronization is required.
//
//                Allows Null Values: HashMap permits null keys and values.
//
//                Performance: Generally, HashMap is faster than Hashtable because it is not synchronized, thus avoiding the overhead of thread safety.
//
//        Differences between Hashtable and HashMap
//        Feature	Hashtable	                                    HashMap
//        Synchronization	Synchronized (thread-safe)	            Not synchronized (not thread-safe)
//        Null Keys/Values	Does not allow null keys/values	        Allows one null key and multiple null values
//        Performance	Slower due to synchronization	            Faster without synchronization overhead
//        Legacy	Part of the original Java 1.0	                Introduced in Java 1.2

//        Hashtable Example:
//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//        hashtable.put(1, "One");
//        hashtable.put(2, "Two");
//        System.out.println(hashtable.get(1)); // Output: One

//        HashMap Example:
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "One");
//        hashMap.put(2, "Two");
//        hashMap.put(null, "NullValue");
//        System.out.println(hashMap.get(1)); // Output: One



    }
}
