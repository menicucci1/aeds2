#pragma once

#include <string>
#include <vector>
#include "TP02Q01.h"

int main(int argc, char **argv)
{
	std::vector<std::wstring> args(argv + 1, argv + argc);
	TP02Q01::main(args);
}

