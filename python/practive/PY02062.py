def check_special_array(test_cases):
    for case in test_cases:
        n, arr = case
        freq = {}  # Bảng tần suất các phần tử
        
        # Đếm tần suất xuất hiện của các phần tử trong dãy
        for num in arr:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1
        
        # Nếu có bất kỳ phần tử nào xuất hiện nhiều hơn 1 lần, thì dãy không phải "độc đắc"
        is_special = True
        for count in freq.values():
            if count > 1:
                is_special = False
                break
        
        if is_special:
            print("YES")
        else:
            print("NO")

# Đọc dữ liệu vào
T = int(input())
test_cases = []
for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))
    test_cases.append((N, A))

# Kiểm tra và in kết quả
check_special_array(test_cases)
