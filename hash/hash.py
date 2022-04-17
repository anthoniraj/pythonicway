import hashlib
hexcode = hashlib.sha256(b'secret@password').hexdigest()
print(hexcode)