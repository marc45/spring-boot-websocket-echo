#!/bin/sh
pid="$(cat server.pid)"
kill 2 $pid

