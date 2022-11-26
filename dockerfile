FROM centos:7
RUN yum install -y httpd
CMD ["/usr/sbin/httpd", "-DFOREGROUND"]