import React, { useState } from 'react';
import './App.css'; 
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  
  const books = [
    { id: 101, bname: 'Master React', price: 670 },
    { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 103, bname: 'Mongo Essentials', price: 450 },
  ]; 

  const blogs = [
    { id: 201, title: 'React Learning', author: 'Stephen Biz', description: 'Welcome to learning React!' },
    { id: 202, title: 'Installation', author: 'Schewzdenier', description: 'You can install React from npm.' },
  ];

  const courses = [
    { id: 301, cname: 'Angular', date: '4/5/2021' },
    { id: 302, cname: 'React', date: '6/3/20201' },
  ];

  
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div className="App">
      <h1>Blogger App Dashboard</h1>

      {/* Buttons to toggle visibility (for conditional rendering example) */}
      <div>
        <button onClick={() => setShowBooks(!showBooks)}>
          {showBooks ? 'Hide Books' : 'Show Books'}
        </button>
        <button onClick={() => setShowBlogs(!showBlogs)}>
          {showBlogs ? 'Hide Blogs' : 'Show Blogs'}
        </button>
        <button onClick={() => setShowCourses(!showCourses)}>
          {showCourses ? 'Hide Courses' : 'Show Courses'}
        </button>
      </div>

      <div className="container">
        {/* Conditional rendering using Logical && Operator */}
        {showBooks && <BookDetails books={books} />}
        {showBlogs && <BlogDetails blogs={blogs} />}
        {showCourses && <CourseDetails courses={courses} />}
      </div>
    </div>
  );
}

export default App;
