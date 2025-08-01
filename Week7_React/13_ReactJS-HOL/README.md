# Blogger App Dashboard

This React application, named "bloggerapp", demonstrates various conditional rendering techniques and the display of list data using React's `map()` function and `keys`. It presents information about books, blogs, and courses in a multi-column layout.

##  Features

* [cite_start]**Book Details Display:** Shows a list of books with their names and prices[cite: 22, 23, 24, 28, 29, 30, 31, 32].
* [cite_start]**Blog Details Display:** Presents blog titles, authors, and descriptions[cite: 33, 34, 35, 36, 37, 38, 39].
* [cite_start]**Course Details Display:** Lists course names and dates[cite: 21, 24, 25, 26, 27].
* [cite_start]**Conditional Rendering:** Implements conditional display of each section (Books, Blogs, Courses) using buttons to toggle their visibility[cite: 7].
* [cite_start]**List Rendering with Keys:** Utilizes the `map()` function to render lists of items, ensuring efficient updates with unique `key` props[cite: 4, 5, 43, 44].
* **Component Structure:** Divides the application into modular components for `BookDetails`, `BlogDetails`, and `CourseDetails`.

## ⚙️ Technologies Used

* **React.js:** A JavaScript library for building user interfaces.
* [cite_start]**Node.js:** JavaScript runtime environment[cite: 10].
* [cite_start]**NPM:** Node Package Manager[cite: 11].
* [cite_start]**Visual Studio Code:** Recommended code editor[cite: 12].
* **HTML:** For structuring the web content.
* **CSS:** For styling the application's layout and appearance.

##  Setup and Installation

Follow these steps to get the project up and running on your local machine.

1.  **Create React App:**
    If you haven't already, create a new React application named `bloggerapp`.
    ```bash
    npx create-react-app bloggerapp
    cd bloggerapp
    ```

2.  **Copy Project Files:**
    Place the following files into your `src/` directory, replacing the default `App.js` and `App.css`:
    * `src/App.js`
    * `src/App.css`
    * `src/BookDetails.js`
    * `src/BlogDetails.js`
    * `src/CourseDetails.js`

3.  **Install Dependencies:**
    Navigate into the project directory and install the necessary Node.js packages.
    ```bash
    npm install
    ```

##  Running the Application

To start the development server and view the application in your browser:

```bash
npm start
