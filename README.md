# test-retry-gradle-plugin-issue-419
Reproducer for https://github.com/gradle/test-retry-gradle-plugin/issues/419

Note unexpected behavior:

<img width="369" height="434" alt="Screenshot 2025-07-16 at 13 43 46" src="https://github.com/user-attachments/assets/74ea7e77-dde7-4f00-846c-aa19eb03ec4b" />

`NotFlakyTest#testNeverFlaky` will run until `FlakyTest#testFlakiness` passes.

This also inflates the number of tests in the HTML test report:

<img width="1001" height="377" alt="Screenshot 2025-07-16 at 13 47 02" src="https://github.com/user-attachments/assets/1d82adfb-4726-44b6-85d8-598a6d3fd986" />
