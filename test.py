# test.py
import time

current_time = time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time()))
print(current_time)

with open("test.txt", "a") as file:
    file.write(current_time)
    file.write("\n")
