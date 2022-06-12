<div id="top"></div>




<!-- PROJECT SHIELDS -->
<!--
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
-->




<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/RaftsDev/LifeMap-ver04-SpringMVC">
    <img src="WebContent\resources\img\Logo-cut-version-70.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">LifeMap project</h3>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
     <li><a href="#Implementation">Implementation</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->

## About The Project

<!-- [![Product Name Screen Shot][product-screenshot]](https://example.com)-->

The main purpose of this project is a task list app where tasks are represented in hierarchical structure. Which is a more intuitive and friendly way for human perception of complex goals.


In the first approach of creating an app the hierarchy was simplified and restricted at two levels. Further this restriction will be readjusted. 

The example below shows a real-life case where the IT department faced an intensive workflow with a local office relocating to another area. In this example, a certain technical team, despite the usual daily routine tasks, received an additional workload. All tasks in the picture are divided into relevant groups and subgroups.

<p align="right">(<a href="#top">back to top</a>)</p>



<img src="WebContent\resources\img\Hierarchy-tasks.png" alt="Hierarchy of tasks" width="500" height="500">

There are two main groups on the left side. Black arrows point to subgroups. Red arrows point to tasks.

<p align="right">(<a href="#top">back to top</a>)</p>

Regarding this requirements interface for user has to looks similar to presented below:

<img src="WebContent\resources\img\Hierarchy-tasks-interface.png" alt="Hierarchy of tasks" width="500" height="500">

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

* [Apache Tomcat ver. 9.5](https://tomcat.apache.org/)
* [MySQL ver. 8.0](https://www.mysql.com/)
* [Bootstrap](https://getbootstrap.com)
* [Hibernate](https://hibernate.org/)
* [Spring](https://spring.io/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->

<!-- ## Getting Started

### Prerequisites



### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<p align="right">(<a href="#top">back to top</a>)</p>  -->



<!-- USAGE EXAMPLES

## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#top">back to top</a>)</p> -->



<!-- ROADMAP -->

## Roadmap

- [x] Add back to top links
- [ ] Add Spring Security
- [ ] Publish as Open Source project
- [ ] Add FrontEnd with React
- [ ] Multi-view Support
    - [ ] Hierarchical view
    - [ ] Table view
- [ ] Connect HoloLens technology

<!-- See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues). -->

<p align="right">(<a href="#top">back to top</a>)</p> 



<!-- Implementation -->
## Implementation

<p><b>Database</b></p>

<img src="WebContent\resources\meta-files\DB-schema.png" alt="Schema of database" width="570" height="370">

<p align="right">(<a href="#top">back to top</a>)</p> 

<p><b>Screenshot of data in Branch table</b></p>

<img src="WebContent\resources\meta-files\adjacency-list.png" alt="adjacency list visual representation" width="570" height="370">

<p align="right">(<a href="#top">back to top</a>)</p> 

<p><b>Code</b></p>

Diagram of hierarchical structure of collections transfers to jsp file through model

<img src="WebContent\resources\meta-files\\HashMap.png" alt="hierarchical structure of collections" width="570" height="370">

<p align="right">(<a href="#top">back to top</a>)</p> 


<!-- CONTRIBUTING 

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>  -->



<!-- LICENSE 

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>  -->



<!-- CONTACT
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#top">back to top</a>)</p>  -->



<!-- ACKNOWLEDGMENTS 
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#top">back to top</a>)</p>   -->



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
<!-- 
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png  -->
