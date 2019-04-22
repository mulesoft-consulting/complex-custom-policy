# complex-custom-policy
The way to create a custom policies has significantly changed with Mule 4 and while we  provide some documentation, it addresses a fairly simple use case. In a real life scenario, our customers are likely to require using more complex constructs, such as the ability to call their own libraries or third party ones.

The goal of this post is therefore to walk us through a complete implementation of a custom policy that will validate a session token
