FROM node:5.9

#https://github.com/phusion/baseimage-docker/issues/58
#ENV DEBIAN_FRONTEND noninteractive

#RUN sudo apt-get update

# option -y  : everything yes
#RUN sudo apt-get -y install nodejs

#RUN sudo apt-get -y install npm

RUN npm install -g protractor

RUN mkdir /home/funcionaltestangular

ADD conf.js /home/funcionaltestangular

ADD todo-spec.js /home/funcionaltestangular

WORKDIR /home/funcionaltestangular

CMD ["/usr/local/bin/protractor","conf.js"]



