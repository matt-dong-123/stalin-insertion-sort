# Stalin Insertion Sort

Stalin Insertion Sort is an enhanced variant of [Stalin Sort](https://github.com/gustavo-depaula/stalin-sort).

The original Stalin Sort removes every element that violates ascending order, using the first element as the initial reference. Once an element is purged, it is killed.

We enhance Stalin Sort by introducing *rehabilitation*--storing those removed elements in a temporary list, then inserting them back into the main list at their correct positions.

Therefore, the removal of elements is now only temporary instead of permanent, making the algorithm actually usable.

And unlike [Merciful Stalin Sort](https://github.com/r-kataria/MercifulStalinSort), another variant of Stalin Sort, ours is even more merciful because we do not apply Stalin Sort recursively.

## Time Complexity

Best case: **O(n)**

Worst case: **O(n²)**

So it kind of (?) works.

## How It Works

1. Traverse the list from left to right, using the first element as initial reference.
2. If an element is smaller than the element before it, remove it, and store it in a temporary list.
3. After all anti-communist elements are removed, add them back according to order.

## Step-by-step Example

Input: `[1, 3, 5, 1233214, 413423, 5553, 14523432, 4, 352]`

### Purge Phase

**Pass 4**

Current list: `[1, 3, 5, 1233214, 413423, 5553, 14523432, 4, 352]`

Compare `1233214` and `413423`.

`1233214 > 413423`, so `413423` is removed.

Current list: `[1, 3, 5, 1233214, 5553, 14523432, 4, 352]`

Temporary list: `[413423]`

---

**Pass 5**

Current list: `[1, 3, 5, 1233214, 5553, 14523432, 4, 352]`

Compare `1233214` and `5553`.

`1233214 > 5553`, so `5553` is removed.

Current list: `[1, 3, 5, 1233214, 14523432, 4, 352]`

Temporary list: `[413423, 5553]`

---

**Pass 7**

Current list: `[1, 3, 5, 1233214, 14523432, 4, 352]`

Compare `14523432` and `4`.

`14523432 > 4`, so `4` is removed.

Current list: `[1, 3, 5, 1233214, 14523432, 352]`

Temporary list: `[413423, 5553, 4]`

---

**Pass 8**

Current list: `[1, 3, 5, 1233214, 14523432, 352]`

Compare `14523432` and `352`.

`14523432 > 352`, so `352` is removed.

Current list: `[1, 3, 5, 1233214, 14523432]`

Temporary list: `[413423, 5553, 4, 352]`

### Rehabilitation Phase

Now the main list is:

`[1, 3, 5, 1233214, 14523432]`

The temporary list is:

`[413423, 5553, 4, 352]`

---

**Insert `413423`**

`413423` belongs between `5` and `1233214`.

Current list: `[1, 3, 5, 413423, 1233214, 14523432]`

---

**Insert `5553`**

`5553` belongs between `5` and `413423`.

Current list: `[1, 3, 5, 5553, 413423, 1233214, 14523432]`

---

**Insert `4`**

`4` belongs between `3` and `5`.

Current list: `[1, 3, 4, 5, 5553, 413423, 1233214, 14523432]`

---

**Insert `352`**

`352` belongs between `5` and `5553`.

Current list: `[1, 3, 4, 5, 352, 5553, 413423, 1233214, 14523432]`

Final output:

`[1, 3, 4, 5, 352, 5553, 413423, 1233214, 14523432]`

## Code

See `main.py` and `Main.java`.


## Disclaimer

This algorithm is **NOT** a joke.
