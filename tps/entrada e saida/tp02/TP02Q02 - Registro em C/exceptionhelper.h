#pragma once

#include <string>
#include <exception>

class IOException : public std::exception
{
private:
    std::string msg;

public:
    IOException(const std::string &message = "") : msg(message)
    {
    }

    const char * what() const noexcept
    {
        return msg.c_str();
    }
};

class ParseException : public std::exception
{
private:
    std::string msg;

public:
    ParseException(const std::string &message = "") : msg(message)
    {
    }

    const char * what() const noexcept
    {
        return msg.c_str();
    }
};
