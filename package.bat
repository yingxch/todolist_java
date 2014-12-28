@echo off
call mvn clean:clean
call mvn -U -Dmaven.test.skip=true package
pause