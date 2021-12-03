package com.alison.scala

// Scala 3
val x = List(2, 7, 4, 8, 23, 44, 11)

@main def BinarySearch(searchItem: Int, items: Array[Int], left: Int, right: Int) =
  if right >= 1 then
    var mid: Int = 1 + (right - left)/2
    if items(mid).eq(x) then
      return mid
    else if items(mid) > x then




