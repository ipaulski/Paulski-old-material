//Izabella Paulski p05 CircularBuffer
/*  REQUIREMENTS NOTES:

	Functions that need to be written have a comment above the function or constructor

	Do not add any additional instance variables

	You may include the implementation/definition in this header file
		-- no need to create a separate .cpp file

*/

#ifndef _CIRCULAR_BUFFER_H
#define _CIRCULAR_BUFFER_H

#include <array>
#include <iterator>
#include <algorithm>
#include <iostream>
#include <cmath>
#include <stdexcept>
using namespace std;

template<typename T, int cap, typename Container = std::array<T, cap> >

class CircularBuffer {

public:
	//type T will be the data type in the Container declared in the template
	using value_type = T;

	//COMPLETE CONSTRUCTOR BELOW
	CircularBuffer()
	{
		_head = 0;
		_tail = 0;
		_size = 0;
		_current = 0;
		_capacity = 5;
		Container c;
	};

	//COMPLETE THE FUNCTIONS BELOW USING THE FUNCTION PROTOTYPE GIVEN

	T& head() {}
	T& tail() {};
	T const& head() const {};
	T const& tail() const {};

	//COMPLETE THE push_back function -- circular buffer will overwrite
	//		oldest data if buffer is full.  This function must update
	//		appropriate instance variables
	void push_back(T val) noexcept
	{
		if (_size == 0) _head = val;
		else if (_size > 0 && _size < _capacity) _tail = val;
		else if (_size > _capacity)
		{
			_head.pop();
			_head = val;
		}
		_size++;
	}

	void pop() {
		if (_size <= 0)
		{
			throw std::underflow_error("pop(): empty buffer");
		}
		_size--;
		_head++;
	}

	// COMPLETE THE FUNCTIONS BELOW
	int size() const noexcept
	{
		return c._size;
	}

	int capacity() noexcept
	{
		return c._capacity;
	}

	bool empty() const noexcept
	{
		return (c._size == 0);
	} //returns true if buffer is empty

	bool full() const noexcept
	{
		return (c._size == 5);
	}  //returns true if buffer is full

	typename Container::iterator begin() { return c.begin(); }

	typename Container::iterator end() { return c.end(); }

	// COMPLETE THE OVERLOADED << OPERATOR
	friend std::ostream& operator<<(std::ostream& os, CircularBuffer& buf)
	{
		os << "Buffer Info: " << "head: " << buf._head << ", tail: "
			<< buf._tail << ", current: " << buf._current << ", size: "
			<< buf._size << "\n\tContainer: " << c;
		return os;
	}

private:
	Container c; // will be std::array<T, cap>
	int _head; //oldest item in buffer
	int _tail; //newest item in buffer
	int _size; //# of elem in buffer
	int _current; //next write position in buffer
	int _capacity;
};
#endif