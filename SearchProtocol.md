# Introduction #

The announce part is where the client (phone) searches for users on the server.

# Details #

HTTP request

Example:
http://server/announce?x=123123&y=123123&number=81695606&range=300
x: longitude posision in world coordinate (GPS position) of user searching
y: latitude posision in world coordinate (GPS position) of user searching
number: phone number (ID) of user searching
range: find all friends in this range from my position

.... add more!

Server responds:
x:1231;y:123123;number:81695606;name:Kalle%20Stropp
x:12131;y:123423;number:82695616;name:Grodan%20Boll
x:12345;y:12753;number:83695696;name:Lisa%20Svensson


each row represents a user, each row ending with newline (\n)