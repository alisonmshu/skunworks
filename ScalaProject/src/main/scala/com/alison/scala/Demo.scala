package com.alison.scala

// Scala 3

//def Swap (a: Int, b: Int) = // Method parameters are immutable in Scala
//  val tmp: Int = a
//  a = b
//  b = tmp

def BubbleSort (items: Array[Int]) =
  val len: Int = items.length - 1
  for (i <- 0 to len) {
    for(j <- 0 to (len - i - 1)) {
      if items(j) > items(j + 1) then
        var tmp: Int = items(j)
        items(j) = items(j + 1)
        items(j + 1) = tmp
    }
  }

def BinarySearch(items: Array[Int], left: Int, right: Int, searchItem: Int): Int =
  if right.>=(left) then
    var mid: Int = left + (right - left)/2
    if items(mid).equals(searchItem) then
      return mid
    else if items(mid).>(searchItem) then
      return BinarySearch(items, left, mid - 1, searchItem)
    else
      return BinarySearch(items, mid + 1, right, searchItem)
  else
    return -1

@main def main =
  val arr = Array(2, 3, 4, 10, 40, 1, 7)
  BubbleSort(arr)
  println("Array is " + arr.toList)
  val len = arr.length
  val x = 7
  println("Search = " + x)
  val result = BinarySearch(arr, 0, len - 1, x)
  if result.equals(-1) then
    println("404 Not Found.")
  else
    println("Found it at index = " + result)





