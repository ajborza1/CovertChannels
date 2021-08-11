# This is a sample Python script.


# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import requests
import time
import datetime


def insert():
    start_timer = time.time()
    body = {'covert_name': 'test12', 'covert_type': 'test12'}
    print(body)
    r = requests.post("http://10.0.0.4:8080/insert", json=body, headers={'Content-Type': 'application/json'})

    print(r.status_code, r.reason)
    print(r.text[:300] + '...')

    end_timer = time.time()
    diff = (end_timer - start_timer)
    return diff


def decode():
    r = requests.get("http://10.0.0.4:8080/data")

    print(r.status_code, r.reason)
    output = r.json()
    base = "2021-07-31T17:23:57.951+00:00"
    last_date_time_obj = datetime.datetime.strptime(base[0:23], '%Y-%m-%dT%H:%M:%S.%f')
    for record in output:
        date_time_str = record["covert_timestamp"]
        # 2021-07-31T17:23:57.951+00:00
        date_time_obj = datetime.datetime.strptime(date_time_str[0:23], '%Y-%m-%dT%H:%M:%S.%f')
        # print(record["covert_timestamp"], ":", date_time_obj)
        diff = date_time_obj - last_date_time_obj
        pos = round(diff.total_seconds() * 15) - 2
        actual = diff.total_seconds() * 15
        # print(round(diff.total_seconds() * 10) - 1)
        if pos < len(chars) and pos >= 0:
            print(pos, "\t", chars[pos], "\t", actual)
        else:
            print("out of bounds")

        last_date_time_obj = date_time_obj


def send(text):
    diff = insert()
    diff = insert()
    for c in text:
        # delay for appropriate gap
        pos = chars.find(c) + 2
        delay = pos / 15
        print("delay: ", delay, " diff: ", diff)
        time.sleep(delay - diff)
        diff = insert()


# chars = "abcdefghijklmnopqrstuvwxyz .,"
chars = " etaoinsrhdlucmfywgpbvkxqjz.,"

# send("mary anthony garry")
send("we choose to go to the moon. we choose to go to the moon in this decade and do the other things, not because they are easy, but because they are hard, because that goal will serve to organize and measure the best of our energies and skills, because that challenge is one that we are willing to accept, one we are unwilling to postpone, and one which we intend to win, and the others, too.")
decode()
