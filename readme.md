# Setup 
reference -https://reportportal.io/installation/
To download using docker on windows- 
## curl -LO https://raw.githubusercontent.com/reportportal/reportportal/master/docker-compose.yml
Above command will download the docker-compose file which is needed.
## docker-compose -p reportportal up -d --force-recreate 
Above command will download required images and will start the needed containers.
## initial password needed can be checked from docker compose file, just search for admin.
credentials-
admin usage- superadmin/erebus
normal user- default/1q2w3e 