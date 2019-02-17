# Java labs helper
# Usage: make -f Makefile <command-name> dir=./<dir-name>/*

cat_all:
	find $(dir) -name "*.java" -print -exec cat {} \;

build_all:
	find $(dir) -name "*.java" -exec javac {} \;

clear_all:
	find . -type f -path "$(dir)" -name "*.class" -delete
