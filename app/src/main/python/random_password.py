import random

lowercase = "abcdefghijklmnopqrstuvwxyz"
uppercase = lowercase.upper()
symbols = "~`! @#$%^&*()_-+={[}]|\:;<,>.?/"
numbers = "1234567890"


all = lowercase + uppercase + symbols + numbers

length = 16

password = ""


for p in range(length):
    password = "".join([password, random.choice(all)])




