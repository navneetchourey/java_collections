# java_collections
Collections FAQs, Internal Implementation and how to synchronize a collection

1)How Hashmap works internally?
HashMap contains an array of Node and Node can represent a class having following objects 
1.	K key
2.	V value
3.	Node next
4.	int hash

key : It stores the key of an element and its final.
value : It holds the value of an element.
next : It holds the pointer to next key-value pair. This attribute makes the key value
pairs stored as a linked list.
hash : It holds the hash code of the key.

 ![image](https://user-images.githubusercontent.com/65907835/130013360-1a6e288a-2201-437e-978a-1ddebc67e7bf.png)


Each key-value pair is
stored in an object of Entry<K, V> class. Entry<K, V> class is the static inner class of HashMap.

Here, We have indexes from 0 to 15 and each row known as a bucket.
 ![image](https://user-images.githubusercontent.com/65907835/130013439-2afc0327-77df-4e0c-bb57-27a91055cd86.png)

 
These Entry objects are stored in an array called table[]. This array is initially of
size 16.
Note: To properly understand the internal working of hashmap we have to first understand below points :
Hashing
hashCode() method
hash() method – HashMap internal method to create hash Value
indexFor() method
equals() method
Buckets
Index Calculation in HashMap
•	Hashing: Hashing is a process of converting an object/variable into integer form by using the method hashCode ().
Hash Codes are used in hashing to decide which group (or bucket) an object should be placed into. A
group of object's might share the same hashcode.

![image](https://user-images.githubusercontent.com/65907835/130013482-55ca1e42-df3a-4e3f-a735-7761cb318192.png)


 





Hash function or simply hash said to be the best if it returns the same hash code each time it is called on the same object. 
HashMap has its own hash function to calculate the hash code of the key. This
function is implemented so that it overcomes poorly implemented hashCode()
methods.


•	hashCode() method
see examples

 ![image](https://user-images.githubusercontent.com/65907835/130013541-7c2380ee-bfbf-43f9-b216-02fbe870aa58.png)


![image](https://user-images.githubusercontent.com/65907835/130013593-d07ca013-839f-4094-92c3-a0be0e7f3d94.png)


![image](https://user-images.githubusercontent.com/65907835/130013600-996081cd-adca-4d78-b2ec-d3c93cebd22c.png)




  

 



•	indexFor() method

After calculating the hash code of the key, it calls indexFor() method by passing
the hash code of the key and length of the table[] array.
This method returns the index in the table[] array for that particular key-value pair.

![image](https://user-images.githubusercontent.com/65907835/130013621-d36fd0e8-30d2-42c2-b297-cd914d7c2fbb.png)
 

If the key is not null, then it calculates the hash code of the key by calling
hash() method.

Calls indexFor() method by passing the hash code calculated in step 2 and
length of the table[] array. This method returns index in table[] array for the
specified key-value pair.

After getting the index, it checks all keys present in the linked list at that
index ( or bucket). If the key is already present in the linked list, it replaces the old
value with new value.

If the key is not present in the linked list, it appends the specified keyvalue
pair at the end of the linked list.


![image](https://user-images.githubusercontent.com/65907835/130013654-e3341cfc-0ab3-4c44-84d3-c391670b3280.png)

















•	The hashCode Contract

Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals
comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.

If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.

It is not required that if two objects are unequal according to the equals (Object) method, then calling the hashCode method on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.

 
![image](https://user-images.githubusercontent.com/65907835/130013683-491c0f00-0b3d-42b3-a78c-4cf92f425935.png)





















•	Hash Collision

When we put an object in a hash map, the key’s hash value is computed and based on this hash value bucket location to store the value object is found. Objects having different hash values must go into different buckets. When two or more objects have the same hash value, they are stored in the same bucket location using an additional data structure called a linked list. All objects having the same hash value are chained together using a linked list. 
![image](https://user-images.githubusercontent.com/65907835/130013730-24831f61-b49a-4cbf-9ae8-d3f3e7675e6e.png)


Does anything go wrong or unexpected when Hash Collision happens What exactly causes HashCollision – the bad definition of custom class’ hashCode() method?

A bad design or algorithm can make it worse
 

Does anything go wrong or unexpected when Hash Collision happens?
A hash collision only means that the hashCode is not unique, which puts you into calling equals(), and the more duplicates there are the worse the performance.

is there any reason why we should avoid Hash Collision?
You have to trade off ease of computation against spread of values. 














•	Load Factor in HashMap:

 
![image](https://user-images.githubusercontent.com/65907835/130013756-31b1a94f-b781-4950-abb8-12baa2030209.png)



•	HashMap in Java8:
 
![image](https://user-images.githubusercontent.com/65907835/130013764-2ea8f8f4-d00d-4d5b-af40-1d7215db32e2.png)

•	Difference between HashMap and HashTable

 
![image](https://user-images.githubusercontent.com/65907835/130013773-bdb67314-c756-4009-af32-3df9a848287a.png)






•	Synchronized HashMap & Concurrent HashMap
 
![image](https://user-images.githubusercontent.com/65907835/130013796-06242d80-c6c8-4998-907a-98994e7acc88.png)

Concurrent HashMap
 
![image](https://user-images.githubusercontent.com/65907835/130013809-87280483-38c8-472f-86d6-1233d8d9deae.png)























•	Difference between Concurrent HashMap and Synchronized HashMap

![image](https://user-images.githubusercontent.com/65907835/130013844-a29e2d4f-d67a-4a35-80ad-5bf006bcbf3b.png)


•	How Hashset works Internally

 

![image](https://user-images.githubusercontent.com/65907835/130013904-3d56445d-dcc4-4132-a5fc-41c8064dcab4.png)








•	Array List Implementation
ArrayList internally uses array object to add(or store) the elements. In other words, ArrayList is backed by Array data -structure. The array of ArrayList is resizable (or dynamic).

![image](https://user-images.githubusercontent.com/65907835/130013931-a7c55781-d2a8-48eb-a27d-afe79c4f2335.png)
 



Internal working of the add() method
 
![image](https://user-images.githubusercontent.com/65907835/130013945-8d0c5203-30df-47d1-a800-1f1da72f5a4a.png)




Insert at a particular index – Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).

![image](https://user-images.githubusercontent.com/65907835/130013957-6bfb495a-bba9-4146-8800-b2e2b7c09d0d.png)

 
![image](https://user-images.githubusercontent.com/65907835/130013979-defb0186-92c3-4593-b499-926a44ea181c.png)


![image](https://user-images.githubusercontent.com/65907835/130013988-29c975ca-1510-4f2e-95f5-6cbcab1c844c.png)




 
 
` 

 


•	Array List Synchronization

![image](https://user-images.githubusercontent.com/65907835/130014005-df124653-1fb2-469e-bc0d-3e9af937f5ba.png)

![image](https://user-images.githubusercontent.com/65907835/130014014-d287f99d-92e3-4640-a87a-df5b757f2526.png)


![image](https://user-images.githubusercontent.com/65907835/130014025-f3d10512-a1c9-481e-9734-e41a599de970.png)



 





 










Similarities between ArrayList and Linked List

![image](https://user-images.githubusercontent.com/65907835/130014040-f0a57d3a-7d48-4b58-8ed4-7df66d203ea8.png)
 

