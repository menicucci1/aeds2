#pragma once

#include <string>
#include <vector>
#include <cmath>
#include "exceptionhelper.h"
#include "stringhelper.h"

class TP02Q01
{

public:
	static void main(std::vector<std::wstring> &args);

	static bool isFim(const std::wstring &str);

	static std::vector<std::wstring> lerArquivo(const std::wstring &fileName);
};

class Game
{
private:
	int app_id = 0;
	std::wstring name;
	Date release_date;
	std::wstring owners;
	int age = 0;
	float price = 0.0F;
	int dlcs = 0;
	std::vector<std::wstring> languages;
	std::wstring website;
	bool windows = false;
	bool mac = false;
	bool linux = false;
	float upvotes = 0.0F;
	int avg_pt = 0;
	std::wstring developers;
	std::vector<std::wstring> genres;

public:
	Game();

	Game(int app_id, const std::wstring &name, Date release_date, const std::wstring &owners, int age, float price, int dlcs, std::vector<std::wstring> &languages, const std::wstring &website, bool windows, bool mac, bool linux, float upvotes, int avg_pt, const std::wstring &developers, std::vector<std::wstring> &genres);

	virtual Game *clone();

	virtual int getApp_id();

	virtual std::wstring getName();

	virtual Date getRelease_date();

	virtual std::wstring getOwners();

	virtual int getAge();

	virtual float getPrice();

	virtual int getDlcs();

	virtual std::vector<std::wstring> getLanguages();

	virtual std::wstring getWebsite();

	virtual bool getWindows();

	virtual bool getMac();

	virtual bool getLinux();

	virtual float getUpvotes();

	virtual int getAvg_pt();

	virtual std::wstring getDevelopers();

	virtual std::vector<std::wstring> getGenres();

	virtual void setApp_id(int app_id);

	virtual void setName(const std::wstring &name);

	virtual void setRelease_date(Date release_date);

	virtual void setOwners(const std::wstring &owners);

	virtual void setAge(int age);

	virtual void setPrice(float price);

	virtual void setDlcs(int dlcs);

	virtual void setLanguages(std::vector<std::wstring> &languages);

	virtual void setWebsite(const std::wstring &website);

	virtual void setWindows(bool windows);

	virtual void setMac(bool mac);

	virtual void setLinux(bool linux);

	virtual void setUpvotes(float upvotes);

	virtual void setAvg_pt(int avg_pt);

	virtual void setDevelopers(const std::wstring &developers);

	virtual void setGenres(std::vector<std::wstring> &genres);


	virtual void ler(const std::wstring &rawLine);

private:
	std::vector<std::wstring> stringToStringArray(const std::wstring &str);

	std::wstring intToTimeString(int intTime);

public:
	virtual void imprimir();
};
