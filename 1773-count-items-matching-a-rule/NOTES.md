Concept : Change 2d list to Array
​
String[][] arr = new String[items.size()][];
int i = 0;
for (List<String> l: items) {
System.out.println(i);
arr[i++] = l.toArray(new String[l.size()]);
}