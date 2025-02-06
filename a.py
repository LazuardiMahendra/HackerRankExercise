L = []
n = 5
for i in range(n):
    L.append(int(input()))
print(L)

Q = input()
if Q == 'Insert':
    x = int(input())
    y = int(input())
    L.insert(x, y)

elif Q == 'Delete':
    x = int(input())
    L.pop(x)

print(L)
