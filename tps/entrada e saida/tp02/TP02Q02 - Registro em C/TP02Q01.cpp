#include "TP02Q01.h"
using namespace 

using BufferedReader = java::io::BufferedReader;
using FileReader = java::io::FileReader;
using IOException = java::io::IOException;
using ParseException = java::text::ParseException;
using SimpleDateFormat = java::text::SimpleDateFormat;

void TP02Q01::main(vector<wstring> &args)
{
	MyIO::setCharset(L"UTF-8");

	vector<wstring> entrada(1000);
	int numEntrada = 0;

	do
	{
		entrada[numEntrada] = MyIO::readLine();
	} while (!(isFim(entrada[numEntrada++])));
	numEntrada--;

	vector<wstring> fileLines = lerArquivo(L"tmp/games.csv");
	for (int i = 0; i < numEntrada; i++)
	{
		for (auto line : fileLines)
		{
			if (entrada[i] == line.split(L",")[0])
			{
				Game *game = new Game();
				game->ler(line);
				game->imprimir();

				delete game;
			}
		}
	}
}

bool TP02Q01::isFim(const wstring &str)
{
	return ((str.length() == 3) && (str[0] == L'F') && (str[1] == L'I') && (str[2] == L'M'));
}

vector<wstring> TP02Q01::lerArquivo(const wstring &fileName)
{
	vector<wstring> linhas;
	try
	{
		FileReader *arq = new FileReader(fileName);
		BufferedReader *br = new BufferedReader(arq);

		for (wstring line = br->readLine(); line != L""; line = br->readLine())
		{
			linhas.push_back(line);
		}

		br->close();

		delete br;
//JAVA TO C++ CONVERTER TODO TASK: A 'delete arq' statement was not added since arq was passed to a method or constructor. Handle memory management manually.
	}
	catch (const IOException &ioe)
	{
	}

	return linhas;
}

Game::Game()
{
	this->app_id = -1;
	this->name = L"";
	this->release_date = Date();
	this->owners = L"";
	this->age = 0;
	this->price = 0.0f;
	this->dlcs = 0;
	this->languages = vector<wstring>(0);
	this->website = L"";
	this->windows = false;
	this->mac = false;
	this->linux = false;
	this->upvotes = 0.0f;
	this->avg_pt = 0;
	this->developers = L"";
	this->genres = vector<wstring>(0);
}

Game::Game(int app_id, const wstring &name, Date release_date, const wstring &owners, int age, float price, int dlcs, vector<wstring> &languages, const wstring &website, bool windows, bool mac, bool linux, float upvotes, int avg_pt, const wstring &developers, vector<wstring> &genres)
{
	this->app_id = app_id;
	this->name = name;
	this->release_date = release_date;
	this->owners = owners;
	this->age = age;
	this->price = price;
	this->dlcs = dlcs;
	this->languages = languages;
	this->website = website;
	this->windows = windows;
	this->mac = mac;
	this->linux = linux;
	this->upvotes = upvotes;
	this->avg_pt = avg_pt;
	this->developers = developers;
	this->genres = genres;
}

Game *Game::clone()
{
	return new Game(this->app_id, this->name, this->release_date, this->owners, this->age, this->price, this->dlcs, this->languages.clone(), this->website, this->windows, this->mac, this->linux, this->upvotes, this->avg_pt, this->developers, this->genres.clone());
}

int Game::getApp_id()
{
	return this->app_id;
}

wstring Game::getName()
{
	return this->name;
}

Date Game::getRelease_date()
{
	return this->release_date;
}

wstring Game::getOwners()
{
	return this->owners;
}

int Game::getAge()
{
	return this->age;
}

float Game::getPrice()
{
	return this->price;
}

int Game::getDlcs()
{
	return this->dlcs;
}

vector<wstring> Game::getLanguages()
{
	return this->languages;
}

wstring Game::getWebsite()
{
	return this->website;
}

bool Game::getWindows()
{
	return this->windows;
}

bool Game::getMac()
{
	return this->mac;
}

bool Game::getLinux()
{
	return this->linux;
}

float Game::getUpvotes()
{
	return this->upvotes;
}

int Game::getAvg_pt()
{
	return this->avg_pt;
}

wstring Game::getDevelopers()
{
	return this->developers;
}


//====================================================================================================
//End of the allowed output for the Free Edition of Java to C++ Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-java-to-cplus.html
//====================================================================================================
