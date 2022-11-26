FROM httpd:2.4

RUN echo "<h1>Test</h1>" > /usr/local/apache2/htdocs/index.html
RUN sed -i "s/Listen 80/Listen 0\.0\.0\.0:80/" "conf/httpd.conf"

