This example  was followed for this tutorial

https://www.digitalocean.com/community/tutorials/how-to-configure-a-continuous-integration-testing-environment-with-docker-and-docker-compose-on-ubuntu-14-04

the wait command is descrited here

https://docs.docker.com/engine/reference/commandline/wait/

and basically do this: Block until a container stops, then print its exit code


Note: This example was made in Windows and I create the file test.sh, howver, the end of the  lines inside the file was CR LF(invalid endings to linux), so that I have to go to Configuration > preferences > new File/ folder  and select Unix format. Only in this ways was allowed to run my test in the container linux. If I had creates this example in Linux, I would not have this problem.