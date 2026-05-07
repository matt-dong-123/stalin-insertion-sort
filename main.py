#!/usr/bin/env python3
# -*- coding: utf-8 -*-
def stalin_insertion_sort(arr):
    arr = arr[:]
    temp = []

    i = 1
    while i < len(arr):
        if arr[i] < arr[i - 1]:
            temp.append(arr.pop(i))
        else:
            i += 1

    for x in temp:
        i = 0
        while i < len(arr) and arr[i] <= x:
            i += 1
        arr.insert(i, x)

    return arr


if __name__ == "__main__":
    arr = [1, 3, 5, 1233214, 413423, 5553, 14523432, 4, 352]
    print(stalin_insertion_sort(arr))